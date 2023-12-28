/**
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.pkgDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webdsl.epackage.pkgdsl.pkgDsl.Age_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.Constraints;
import webdsl.epackage.pkgdsl.pkgDsl.Delay_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.Execution_Time_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.Order_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.Pattern_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.Periodic_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage;
import webdsl.epackage.pkgdsl.pkgDsl.Reaction_Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getPeriodic_constraint <em>Periodic constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getDelay_constraint <em>Delay constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getAge_constraint <em>Age constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getExecution_time_constraint <em>Execution time constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getOrder_constraint <em>Order constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getPattern_constraint <em>Pattern constraint</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.ConstraintsImpl#getReaction_constraint <em>Reaction constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsImpl extends MinimalEObjectImpl.Container implements Constraints
{
  /**
   * The default value of the '{@link #getDefine() <em>Define</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefine()
   * @generated
   * @ordered
   */
  protected static final String DEFINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefine() <em>Define</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefine()
   * @generated
   * @ordered
   */
  protected String define = DEFINE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPeriodic_constraint() <em>Periodic constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriodic_constraint()
   * @generated
   * @ordered
   */
  protected EList<Periodic_Constraint> periodic_constraint;

  /**
   * The cached value of the '{@link #getDelay_constraint() <em>Delay constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay_constraint()
   * @generated
   * @ordered
   */
  protected EList<Delay_Constraint> delay_constraint;

  /**
   * The cached value of the '{@link #getAge_constraint() <em>Age constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge_constraint()
   * @generated
   * @ordered
   */
  protected EList<Age_Constraint> age_constraint;

  /**
   * The cached value of the '{@link #getExecution_time_constraint() <em>Execution time constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution_time_constraint()
   * @generated
   * @ordered
   */
  protected EList<Execution_Time_Constraint> execution_time_constraint;

  /**
   * The cached value of the '{@link #getOrder_constraint() <em>Order constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder_constraint()
   * @generated
   * @ordered
   */
  protected EList<Order_Constraint> order_constraint;

  /**
   * The cached value of the '{@link #getPattern_constraint() <em>Pattern constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern_constraint()
   * @generated
   * @ordered
   */
  protected EList<Pattern_Constraint> pattern_constraint;

  /**
   * The cached value of the '{@link #getReaction_constraint() <em>Reaction constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReaction_constraint()
   * @generated
   * @ordered
   */
  protected EList<Reaction_Constraint> reaction_constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PkgDslPackage.Literals.CONSTRAINTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefine()
  {
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefine(String newDefine)
  {
    String oldDefine = define;
    define = newDefine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.CONSTRAINTS__DEFINE, oldDefine, define));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Periodic_Constraint> getPeriodic_constraint()
  {
    if (periodic_constraint == null)
    {
      periodic_constraint = new EObjectContainmentEList<Periodic_Constraint>(Periodic_Constraint.class, this, PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT);
    }
    return periodic_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Delay_Constraint> getDelay_constraint()
  {
    if (delay_constraint == null)
    {
      delay_constraint = new EObjectContainmentEList<Delay_Constraint>(Delay_Constraint.class, this, PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT);
    }
    return delay_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Age_Constraint> getAge_constraint()
  {
    if (age_constraint == null)
    {
      age_constraint = new EObjectContainmentEList<Age_Constraint>(Age_Constraint.class, this, PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT);
    }
    return age_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Execution_Time_Constraint> getExecution_time_constraint()
  {
    if (execution_time_constraint == null)
    {
      execution_time_constraint = new EObjectContainmentEList<Execution_Time_Constraint>(Execution_Time_Constraint.class, this, PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT);
    }
    return execution_time_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Order_Constraint> getOrder_constraint()
  {
    if (order_constraint == null)
    {
      order_constraint = new EObjectContainmentEList<Order_Constraint>(Order_Constraint.class, this, PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT);
    }
    return order_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Pattern_Constraint> getPattern_constraint()
  {
    if (pattern_constraint == null)
    {
      pattern_constraint = new EObjectContainmentEList<Pattern_Constraint>(Pattern_Constraint.class, this, PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT);
    }
    return pattern_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reaction_Constraint> getReaction_constraint()
  {
    if (reaction_constraint == null)
    {
      reaction_constraint = new EObjectContainmentEList<Reaction_Constraint>(Reaction_Constraint.class, this, PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT);
    }
    return reaction_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT:
        return ((InternalEList<?>)getPeriodic_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT:
        return ((InternalEList<?>)getDelay_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT:
        return ((InternalEList<?>)getAge_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT:
        return ((InternalEList<?>)getExecution_time_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT:
        return ((InternalEList<?>)getOrder_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT:
        return ((InternalEList<?>)getPattern_constraint()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT:
        return ((InternalEList<?>)getReaction_constraint()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PkgDslPackage.CONSTRAINTS__DEFINE:
        return getDefine();
      case PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT:
        return getPeriodic_constraint();
      case PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT:
        return getDelay_constraint();
      case PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT:
        return getAge_constraint();
      case PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT:
        return getExecution_time_constraint();
      case PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT:
        return getOrder_constraint();
      case PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT:
        return getPattern_constraint();
      case PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT:
        return getReaction_constraint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PkgDslPackage.CONSTRAINTS__DEFINE:
        setDefine((String)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT:
        getPeriodic_constraint().clear();
        getPeriodic_constraint().addAll((Collection<? extends Periodic_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT:
        getDelay_constraint().clear();
        getDelay_constraint().addAll((Collection<? extends Delay_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT:
        getAge_constraint().clear();
        getAge_constraint().addAll((Collection<? extends Age_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT:
        getExecution_time_constraint().clear();
        getExecution_time_constraint().addAll((Collection<? extends Execution_Time_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT:
        getOrder_constraint().clear();
        getOrder_constraint().addAll((Collection<? extends Order_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT:
        getPattern_constraint().clear();
        getPattern_constraint().addAll((Collection<? extends Pattern_Constraint>)newValue);
        return;
      case PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT:
        getReaction_constraint().clear();
        getReaction_constraint().addAll((Collection<? extends Reaction_Constraint>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PkgDslPackage.CONSTRAINTS__DEFINE:
        setDefine(DEFINE_EDEFAULT);
        return;
      case PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT:
        getPeriodic_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT:
        getDelay_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT:
        getAge_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT:
        getExecution_time_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT:
        getOrder_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT:
        getPattern_constraint().clear();
        return;
      case PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT:
        getReaction_constraint().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PkgDslPackage.CONSTRAINTS__DEFINE:
        return DEFINE_EDEFAULT == null ? define != null : !DEFINE_EDEFAULT.equals(define);
      case PkgDslPackage.CONSTRAINTS__PERIODIC_CONSTRAINT:
        return periodic_constraint != null && !periodic_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__DELAY_CONSTRAINT:
        return delay_constraint != null && !delay_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__AGE_CONSTRAINT:
        return age_constraint != null && !age_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__EXECUTION_TIME_CONSTRAINT:
        return execution_time_constraint != null && !execution_time_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__ORDER_CONSTRAINT:
        return order_constraint != null && !order_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__PATTERN_CONSTRAINT:
        return pattern_constraint != null && !pattern_constraint.isEmpty();
      case PkgDslPackage.CONSTRAINTS__REACTION_CONSTRAINT:
        return reaction_constraint != null && !reaction_constraint.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (define: ");
    result.append(define);
    result.append(')');
    return result.toString();
  }

} //ConstraintsImpl