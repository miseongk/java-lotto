package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.Validation;

public class InputView {
    public int getMoney() {
        String input = Console.readLine();
        try {
            Validation.validateMoney(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return Integer.parseInt(input);
    }

    public String getLottoNumbers() {
        String input = Console.readLine();

        try {
            Validation.validateLottoNumbers(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }

    public String getBonusNumber() {
        String input = Console.readLine();

        try {
            Validation.validateBonusNumbers(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }

}
