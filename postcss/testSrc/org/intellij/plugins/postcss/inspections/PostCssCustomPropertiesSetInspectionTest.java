package org.intellij.plugins.postcss.inspections;

import com.intellij.psi.css.inspections.invalid.CssUnresolvedCustomPropertySetInspection;
import com.intellij.testFramework.TestDataPath;
import org.intellij.plugins.postcss.PostCssFixtureTestCase;
import org.jetbrains.annotations.NotNull;

@TestDataPath("$CONTENT_ROOT/testData/inspections/customPropertiesSet/")
public class PostCssCustomPropertiesSetInspectionTest extends PostCssFixtureTestCase {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    myFixture.enableInspections(PostCssCustomPropertiesSetInspection.class, CssUnresolvedCustomPropertySetInspection.class);
  }

  public void testCorrectApply() {
    doTest();
  }

  public void testEmptyApply() {
    doTest();
  }

  public void testEmptyCustomPropertiesSetName() {
    doTest();
  }

  public void testIncorrectCustomPropertiesSetName() {
    doTest();
  }

  public void testInsideRoot() {
    doTest();
  }

  public void testInsideAtRule() {
    doTest();
  }

  public void testOutsideRoot() {
    doTest();
  }

  public void testUnresolvedApply() {
    doTest();
  }

  private long doTest() {
    return myFixture.testHighlighting(true, false, false, getTestName(true) + ".pcss");
  }

  @NotNull
  @Override
  protected String getTestDataSubdir() {
    return "customPropertiesSet";
  }
}