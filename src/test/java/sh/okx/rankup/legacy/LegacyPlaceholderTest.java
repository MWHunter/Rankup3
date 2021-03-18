package sh.okx.rankup.legacy;

import be.seeseemelk.mockbukkit.entity.PlayerMock;
import org.junit.Test;
import sh.okx.rankup.RankupTest;

public class LegacyPlaceholderTest extends RankupTest {
  public LegacyPlaceholderTest() {
    super("legacy");
  }

  @Test
  public void testLegacy() {
    PlayerMock player = server.addPlayer("testPlayer");

    plugin.getEconomy().setPlayer(player, 100);
    player.setLevel(1);

    groupProvider.addGroup(player.getUniqueId(), "A");
    plugin.getHelper().rankup(player);

    player.assertSaid("testPlayer A B A-display last rank 1,000 900 4 1 3 25 75");
  }
}
