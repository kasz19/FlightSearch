package org.test.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.test.services.BasicSearchEngineTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  BasicSearchEngineTest.class
})

public class ServiceSuitTest {

}
