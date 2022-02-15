package at.spengergasse.library.service;

import at.spengergasse.library.billing.User;
import at.spengergasse.library.persistance.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PremiumServiceTest {

    PremiumService sut;
    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setup() {
        sut = new PremiumService();
    }

    @Test
    void someFeature_returnsArgument() {
        assertThat(sut.someFeature(69, 1)).isEqualTo(69);
        assertThat(sut.someFeature(420, 1)).isEqualTo(420);
    }

    @Test
    void someFeature_AspectWorksProperly() {
        // arrange
        BigDecimal expectedAmountToPay = BigDecimal.valueOf(0.10);
        long userId = 1;
        // act
        sut.someFeature(69, userId);
        // assert
        User user = userRepository.fromId(userId);
        assertThat(user.amountToPay).isEqualTo(expectedAmountToPay);
    }

}