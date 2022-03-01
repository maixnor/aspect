package at.spengergasse.library.aspect;

import at.spengergasse.library.billing.User;
import at.spengergasse.library.persistance.UserRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class AddToBillingAspect {

    public static BigDecimal defaultBillingAmount = BigDecimal.valueOf(0.69);

    UserRepository userRepository;

    public AddToBillingAspect(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Around("@annotation(at.spengergasse.library.annotation.AddToBilling)")
    public Object addToBilling(ProceedingJoinPoint joinPoint) throws Throwable {
        long userId = (long)joinPoint.getArgs()[1];
        User user = userRepository.fromId(userId);
        user.addAmount(defaultBillingAmount);
        System.out.printf("user with id %s was billed %s.\n%n", user.id, defaultBillingAmount.toString());
        return joinPoint.proceed();
    }
}
