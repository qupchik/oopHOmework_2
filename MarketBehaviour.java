package task_1;

import java.util.List;

/**
 * MarketBehaviour
 */
interface MarketBehaviour {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}