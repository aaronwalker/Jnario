package gameoflife;

import gameoflife.Evolution;
import gameoflife.World;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Blinker")
@SuppressWarnings("all")
public class SimulatingGameOfLifeFeatureBlinker {
  @Test
  @Order(0)
  @Named("Given a world")
  public void givenAWorld() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\t-----\n\t\t\t\t--X--\n\t\t\t\t--X--\n\t\t\t\t--X--\n\t\t\t\t-----\n\t\t\t");
      final StepArguments args = _stepArguments;
      this.world = World.parseWorld(new Function0<CharSequence>() {
        public CharSequence apply() {
          StepArguments _args = args;
          String _first = JnarioIterableExtensions.<String>first(_args);
          return _first;
        }
      }.apply());
  }
  
  @Test
  @Order(1)
  @Named("When the world evolves")
  public void whenTheWorldEvolves() {
    this.world = Evolution.gameOfLife().evolve(world);
  }
  
  @Test
  @Order(2)
  @Named("Then the world is")
  public void thenTheWorldIs() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\t-----\n\t\t\t\t-----\n\t\t\t\t-XXX-\n\t\t\t\t-----\n\t\t\t\t-----\n\t\t\t");
      final StepArguments args = _stepArguments;
      StepArguments _args = args;
      String _first = JnarioIterableExtensions.<String>first(_args);
      World _parseWorld = World.parseWorld(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(world, _parseWorld);
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(_parseWorld).toString() + "\n", _doubleArrow);
      
  }
  
  World world;
}
