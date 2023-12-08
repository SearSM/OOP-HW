import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Human human);

    void releaseFromMarket(List<Human> humans);

    void update();

}
