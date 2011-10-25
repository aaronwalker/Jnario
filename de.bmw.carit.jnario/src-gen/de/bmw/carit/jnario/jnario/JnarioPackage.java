/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.jnario.JnarioFactory
 * @model kind="package"
 * @generated
 */
public interface JnarioPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jnario";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bmw.de/carit/jnario/Jnario";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jnario";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JnarioPackage eINSTANCE = de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl.init();

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
   * @generated
   */
  int JNARIO = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__NAME = 2;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__BACKGROUND = 3;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO__SCENARIOS = 4;

  /**
   * The number of structural features of the '<em>Jnario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JNARIO_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ImportImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__STATIC = 0;

  /**
   * The feature id for the '<em><b>Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__EXTENSION = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 2;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.BackgroundImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 2;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__STEPS = 0;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ScenarioImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = 1;

  /**
   * The feature id for the '<em><b>Examples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__EXAMPLES = 2;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.StepImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getStep()
   * @generated
   */
  int STEP = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__CODE = 1;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.GivenImpl <em>Given</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.GivenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGiven()
   * @generated
   */
  int GIVEN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>Given</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GIVEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.WhenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ThenImpl <em>Then</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ThenImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThen()
   * @generated
   */
  int THEN = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__NAME = STEP__NAME;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN__CODE = STEP__CODE;

  /**
   * The number of structural features of the '<em>Then</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.AndImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAnd()
   * @generated
   */
  int AND = 8;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__STEPS = BACKGROUND__STEPS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__NAME = BACKGROUND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__CODE = BACKGROUND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = BACKGROUND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.CodeImpl <em>Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.CodeImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getCode()
   * @generated
   */
  int CODE = 9;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Block Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__BLOCK_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExamplesImpl <em>Examples</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ExamplesImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExamples()
   * @generated
   */
  int EXAMPLES = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__NAME = 0;

  /**
   * The feature id for the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__HEADING = 1;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES__ROWS = 2;

  /**
   * The number of structural features of the '<em>Examples</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeading()
   * @generated
   */
  int EXAMPLE_HEADING = 11;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING__PARTS = 0;

  /**
   * The number of structural features of the '<em>Example Heading</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ExampleRowImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleRow()
   * @generated
   */
  int EXAMPLE_ROW = 12;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_ROW__PARTS = 0;

  /**
   * The number of structural features of the '<em>Example Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_ROW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ExampleCellImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleCell()
   * @generated
   */
  int EXAMPLE_CELL = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_CELL__NAME = 0;

  /**
   * The number of structural features of the '<em>Example Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_CELL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingCellImpl <em>Example Heading Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingCellImpl
   * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeadingCell()
   * @generated
   */
  int EXAMPLE_HEADING_CELL = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_CELL__TYPE = XbasePackage.XVARIABLE_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_CELL__NAME = XbasePackage.XVARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_CELL__RIGHT = XbasePackage.XVARIABLE_DECLARATION__RIGHT;

  /**
   * The feature id for the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_CELL__WRITEABLE = XbasePackage.XVARIABLE_DECLARATION__WRITEABLE;

  /**
   * The number of structural features of the '<em>Example Heading Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_HEADING_CELL_FEATURE_COUNT = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Jnario <em>Jnario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jnario</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario
   * @generated
   */
  EClass getJnario();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Jnario#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getPackage()
   * @see #getJnario()
   * @generated
   */
  EAttribute getJnario_Package();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Jnario#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getImports()
   * @see #getJnario()
   * @generated
   */
  EReference getJnario_Imports();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Jnario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getName()
   * @see #getJnario()
   * @generated
   */
  EAttribute getJnario_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Jnario#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getBackground()
   * @see #getJnario()
   * @generated
   */
  EReference getJnario_Background();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Jnario#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see de.bmw.carit.jnario.jnario.Jnario#getScenarios()
   * @see #getJnario()
   * @generated
   */
  EReference getJnario_Scenarios();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.bmw.carit.jnario.jnario.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Import#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see de.bmw.carit.jnario.jnario.Import#isStatic()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Static();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Import#isExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension</em>'.
   * @see de.bmw.carit.jnario.jnario.Import#isExtension()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Extension();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.bmw.carit.jnario.jnario.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see de.bmw.carit.jnario.jnario.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Background#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see de.bmw.carit.jnario.jnario.Background#getSteps()
   * @see #getBackground()
   * @generated
   */
  EReference getBackground_Steps();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Scenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getSteps()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Steps();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Scenario#getExamples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Examples</em>'.
   * @see de.bmw.carit.jnario.jnario.Scenario#getExamples()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Examples();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see de.bmw.carit.jnario.jnario.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Step#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see de.bmw.carit.jnario.jnario.Step#getCode()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Code();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Given</em>'.
   * @see de.bmw.carit.jnario.jnario.Given
   * @generated
   */
  EClass getGiven();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When</em>'.
   * @see de.bmw.carit.jnario.jnario.When
   * @generated
   */
  EClass getWhen();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then</em>'.
   * @see de.bmw.carit.jnario.jnario.Then
   * @generated
   */
  EClass getThen();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see de.bmw.carit.jnario.jnario.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code</em>'.
   * @see de.bmw.carit.jnario.jnario.Code
   * @generated
   */
  EClass getCode();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Code#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.bmw.carit.jnario.jnario.Code#getAnnotations()
   * @see #getCode()
   * @generated
   */
  EReference getCode_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Code#getBlockExpression <em>Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block Expression</em>'.
   * @see de.bmw.carit.jnario.jnario.Code#getBlockExpression()
   * @see #getCode()
   * @generated
   */
  EReference getCode_BlockExpression();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.Examples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Examples</em>'.
   * @see de.bmw.carit.jnario.jnario.Examples
   * @generated
   */
  EClass getExamples();

  /**
   * Returns the meta object for the attribute '{@link de.bmw.carit.jnario.jnario.Examples#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.Examples#getName()
   * @see #getExamples()
   * @generated
   */
  EAttribute getExamples_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.Examples#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heading</em>'.
   * @see de.bmw.carit.jnario.jnario.Examples#getHeading()
   * @see #getExamples()
   * @generated
   */
  EReference getExamples_Heading();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.Examples#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see de.bmw.carit.jnario.jnario.Examples#getRows()
   * @see #getExamples()
   * @generated
   */
  EReference getExamples_Rows();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleHeading <em>Example Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Heading</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleHeading
   * @generated
   */
  EClass getExampleHeading();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.ExampleHeading#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleHeading#getParts()
   * @see #getExampleHeading()
   * @generated
   */
  EReference getExampleHeading_Parts();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleRow <em>Example Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Row</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleRow
   * @generated
   */
  EClass getExampleRow();

  /**
   * Returns the meta object for the containment reference list '{@link de.bmw.carit.jnario.jnario.ExampleRow#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleRow#getParts()
   * @see #getExampleRow()
   * @generated
   */
  EReference getExampleRow_Parts();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleCell <em>Example Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Cell</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleCell
   * @generated
   */
  EClass getExampleCell();

  /**
   * Returns the meta object for the containment reference '{@link de.bmw.carit.jnario.jnario.ExampleCell#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleCell#getName()
   * @see #getExampleCell()
   * @generated
   */
  EReference getExampleCell_Name();

  /**
   * Returns the meta object for class '{@link de.bmw.carit.jnario.jnario.ExampleHeadingCell <em>Example Heading Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example Heading Cell</em>'.
   * @see de.bmw.carit.jnario.jnario.ExampleHeadingCell
   * @generated
   */
  EClass getExampleHeadingCell();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JnarioFactory getJnarioFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.JnarioImpl <em>Jnario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.JnarioImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getJnario()
     * @generated
     */
    EClass JNARIO = eINSTANCE.getJnario();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JNARIO__PACKAGE = eINSTANCE.getJnario_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JNARIO__IMPORTS = eINSTANCE.getJnario_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JNARIO__NAME = eINSTANCE.getJnario_Name();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JNARIO__BACKGROUND = eINSTANCE.getJnario_Background();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JNARIO__SCENARIOS = eINSTANCE.getJnario_Scenarios();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ImportImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__STATIC = eINSTANCE.getImport_Static();

    /**
     * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__EXTENSION = eINSTANCE.getImport_Extension();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.BackgroundImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND__STEPS = eINSTANCE.getBackground_Steps();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ScenarioImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

    /**
     * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__EXAMPLES = eINSTANCE.getScenario_Examples();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.StepImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__CODE = eINSTANCE.getStep_Code();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.GivenImpl <em>Given</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.GivenImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getGiven()
     * @generated
     */
    EClass GIVEN = eINSTANCE.getGiven();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.WhenImpl <em>When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.WhenImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getWhen()
     * @generated
     */
    EClass WHEN = eINSTANCE.getWhen();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ThenImpl <em>Then</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ThenImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getThen()
     * @generated
     */
    EClass THEN = eINSTANCE.getThen();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.AndImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.CodeImpl <em>Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.CodeImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getCode()
     * @generated
     */
    EClass CODE = eINSTANCE.getCode();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__ANNOTATIONS = eINSTANCE.getCode_Annotations();

    /**
     * The meta object literal for the '<em><b>Block Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__BLOCK_EXPRESSION = eINSTANCE.getCode_BlockExpression();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExamplesImpl <em>Examples</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ExamplesImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExamples()
     * @generated
     */
    EClass EXAMPLES = eINSTANCE.getExamples();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLES__NAME = eINSTANCE.getExamples_Name();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLES__HEADING = eINSTANCE.getExamples_Heading();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLES__ROWS = eINSTANCE.getExamples_Rows();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl <em>Example Heading</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeading()
     * @generated
     */
    EClass EXAMPLE_HEADING = eINSTANCE.getExampleHeading();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_HEADING__PARTS = eINSTANCE.getExampleHeading_Parts();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleRowImpl <em>Example Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ExampleRowImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleRow()
     * @generated
     */
    EClass EXAMPLE_ROW = eINSTANCE.getExampleRow();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_ROW__PARTS = eINSTANCE.getExampleRow_Parts();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleCellImpl <em>Example Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ExampleCellImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleCell()
     * @generated
     */
    EClass EXAMPLE_CELL = eINSTANCE.getExampleCell();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE_CELL__NAME = eINSTANCE.getExampleCell_Name();

    /**
     * The meta object literal for the '{@link de.bmw.carit.jnario.jnario.impl.ExampleHeadingCellImpl <em>Example Heading Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.bmw.carit.jnario.jnario.impl.ExampleHeadingCellImpl
     * @see de.bmw.carit.jnario.jnario.impl.JnarioPackageImpl#getExampleHeadingCell()
     * @generated
     */
    EClass EXAMPLE_HEADING_CELL = eINSTANCE.getExampleHeadingCell();

  }

} //JnarioPackage
