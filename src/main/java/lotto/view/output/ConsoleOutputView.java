package lotto.view.output;

import java.util.Arrays;
import java.util.List;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printCostMessage() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    @Override
    public void printNewLine() {
        System.out.println();
    }

    @Override
    public void printPurchaseResult(int purchaseResult) {
        printNewLine();
        System.out.println(purchaseResult + "개를 구매했습니다.");
    }

    @Override
    public void printLotto(List<Integer> lotto) {
        lotto.sort(Integer::compareTo);
        System.out.println(lotto);
    }
}
