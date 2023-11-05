package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Lotto> lotto;
    private Cost cost;

    public Player(String cost) {
        this.cost = new Cost(cost);
        this.lotto = new ArrayList<>(getLottoCount());
    }

    public List<Lotto> getLotto() {
        return this.lotto;
    }

    public int getLottoCount() {
        return this.cost.getValue() / 1000;
    }

    public void buyLotto(List<Integer> numbers) {
        this.lotto.add(new Lotto(numbers));
    }
}