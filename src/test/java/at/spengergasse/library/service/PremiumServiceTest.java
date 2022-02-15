package at.spengergasse.library.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PremiumServiceTest {

    PremiumService sut;

    @BeforeEach
    void setup() {
        sut = new PremiumService();
    }

    @Test
    void someFeature_returnsArgument() {
        assertThat(sut.someFeature(69)).isEqualTo(69);
        assertThat(sut.someFeature(420)).isEqualTo(420);
    }

}