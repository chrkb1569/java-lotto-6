package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleInputView implements InputView {
    @Override
    public String getCost() {
        return Console.readLine();
    }
}
