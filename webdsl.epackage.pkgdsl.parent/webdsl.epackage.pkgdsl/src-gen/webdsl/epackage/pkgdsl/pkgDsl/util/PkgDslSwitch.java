/**
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.pkgDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import webdsl.epackage.pkgdsl.pkgDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage
 * @generated
 */
public class PkgDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PkgDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PkgDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PkgDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PkgDslPackage.FILE:
      {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EA_PACKAGE:
      {
        EA_Package eA_Package = (EA_Package)theEObject;
        T result = caseEA_Package(eA_Package);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.SUB_PACKAGE:
      {
        Sub_Package sub_Package = (Sub_Package)theEObject;
        T result = caseSub_Package(sub_Package);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.NESTED_PACKAGE:
      {
        Nested_Package nested_Package = (Nested_Package)theEObject;
        T result = caseNested_Package(nested_Package);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.ELEMENTS:
      {
        Elements elements = (Elements)theEObject;
        T result = caseElements(elements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.TIMING:
      {
        Timing timing = (Timing)theEObject;
        T result = caseTiming(timing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.CONSTRAINTS:
      {
        Constraints constraints = (Constraints)theEObject;
        T result = caseConstraints(constraints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.REACTION_CONSTRAINT:
      {
        Reaction_Constraint reaction_Constraint = (Reaction_Constraint)theEObject;
        T result = caseReaction_Constraint(reaction_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.RC_TIMING_EXPRESSION:
      {
        RC_TimingExpression rC_TimingExpression = (RC_TimingExpression)theEObject;
        T result = caseRC_TimingExpression(rC_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.PATTERN_CONSTRAINT:
      {
        Pattern_Constraint pattern_Constraint = (Pattern_Constraint)theEObject;
        T result = casePattern_Constraint(pattern_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.PATTERN_CONSTRAINT_TIMING_EXPRESSION:
      {
        Pattern_Constraint_TimingExpression pattern_Constraint_TimingExpression = (Pattern_Constraint_TimingExpression)theEObject;
        T result = casePattern_Constraint_TimingExpression(pattern_Constraint_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.ORDER_CONSTRAINT:
      {
        Order_Constraint order_Constraint = (Order_Constraint)theEObject;
        T result = caseOrder_Constraint(order_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EXECUTION_TIME_CONSTRAINT:
      {
        Execution_Time_Constraint execution_Time_Constraint = (Execution_Time_Constraint)theEObject;
        T result = caseExecution_Time_Constraint(execution_Time_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.ETC_TIMING_EXPRESSION:
      {
        ETC_TimingExpression etC_TimingExpression = (ETC_TimingExpression)theEObject;
        T result = caseETC_TimingExpression(etC_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.AGE_CONSTRAINT:
      {
        Age_Constraint age_Constraint = (Age_Constraint)theEObject;
        T result = caseAge_Constraint(age_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.TEST1:
      {
        test1 test1 = (test1)theEObject;
        T result = casetest1(test1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.AC_TIMING_EXPRESSION:
      {
        AC_TimingExpression aC_TimingExpression = (AC_TimingExpression)theEObject;
        T result = caseAC_TimingExpression(aC_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.DELAY_CONSTRAINT:
      {
        Delay_Constraint delay_Constraint = (Delay_Constraint)theEObject;
        T result = caseDelay_Constraint(delay_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.DC_TIMING_EXPRESSION:
      {
        DC_TimingExpression dC_TimingExpression = (DC_TimingExpression)theEObject;
        T result = caseDC_TimingExpression(dC_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.PERIODIC_CONSTRAINT:
      {
        Periodic_Constraint periodic_Constraint = (Periodic_Constraint)theEObject;
        T result = casePeriodic_Constraint(periodic_Constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.PC_TIMING_EXPRESSION:
      {
        PC_TimingExpression pC_TimingExpression = (PC_TimingExpression)theEObject;
        T result = casePC_TimingExpression(pC_TimingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.DESCRIPTIONS:
      {
        Descriptions descriptions = (Descriptions)theEObject;
        T result = caseDescriptions(descriptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EVENT_CHAIN:
      {
        Event_Chain event_Chain = (Event_Chain)theEObject;
        T result = caseEvent_Chain(event_Chain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EVENT_FUNCTION_FLOW_PORT:
      {
        Event_Function_Flow_Port event_Function_Flow_Port = (Event_Function_Flow_Port)theEObject;
        T result = caseEvent_Function_Flow_Port(event_Function_Flow_Port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EVENT_FUNCTION:
      {
        Event_Function event_Function = (Event_Function)theEObject;
        T result = caseEvent_Function(event_Function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.UNIT:
      {
        Unit unit = (Unit)theEObject;
        T result = caseUnit(unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.QUANTITY:
      {
        Quantity quantity = (Quantity)theEObject;
        T result = caseQuantity(quantity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PkgDslPackage.EA_NUMERICAL:
      {
        EA_Numerical eA_Numerical = (EA_Numerical)theEObject;
        T result = caseEA_Numerical(eA_Numerical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EA Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EA Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEA_Package(EA_Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSub_Package(Sub_Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNested_Package(Nested_Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElements(Elements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTiming(Timing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraints</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraints(Constraints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReaction_Constraint(Reaction_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RC Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RC Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRC_TimingExpression(RC_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern_Constraint(Pattern_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Constraint Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Constraint Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern_Constraint_TimingExpression(Pattern_Constraint_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrder_Constraint(Order_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Time Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecution_Time_Constraint(Execution_Time_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ETC Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ETC Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETC_TimingExpression(ETC_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Age Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAge_Constraint(Age_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>test1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>test1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetest1(test1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AC Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AC Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAC_TimingExpression(AC_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelay_Constraint(Delay_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DC Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DC Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDC_TimingExpression(DC_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Periodic Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePeriodic_Constraint(Periodic_Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PC Timing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PC Timing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePC_TimingExpression(PC_TimingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descriptions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descriptions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptions(Descriptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Chain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Chain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent_Chain(Event_Chain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Function Flow Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Function Flow Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent_Function_Flow_Port(Event_Function_Flow_Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent_Function(Event_Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnit(Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantity(Quantity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEA_Numerical(EA_Numerical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PkgDslSwitch
