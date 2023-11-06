package lotto;

import lotto.domain.Lotto;
import lotto.domain.NumberGenerator;
import lotto.output.NumberGeneratorOutput;
import lotto.output.PurchaseResultHandler;

import java.util.List;
import java.util.Set;

import static lotto.input.WinningNumbers.getWinningNumbers;

public class Application {
    public static void main(String[] args) {
        int numberOfLotto = PurchaseResultHandler.purchaseRequest();

        NumberGenerator numbers = new NumberGenerator();
        NumberGeneratorOutput numbersOutput = new NumberGeneratorOutput();
        numbersOutput.printLotteryNumbers(numbers, numberOfLotto);

        Set<Integer> winningNumbers = getWinningNumbers();
        System.out.println(winningNumbers);

    }
}

