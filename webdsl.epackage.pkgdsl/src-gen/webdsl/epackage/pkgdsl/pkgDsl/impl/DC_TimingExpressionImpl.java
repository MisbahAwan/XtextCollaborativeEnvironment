/**
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.pkgDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webdsl.epackage.pkgdsl.pkgDsl.DC_TimingExpression;
import webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Timing Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.DC_TimingExpressionImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.DC_TimingExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.DC_TimingExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.DC_TimingExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DC_TimingExpressionImpl extends MinimalEObjectImpl.Container implements DC_TimingExpression
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DC_TimingExpressionImpl()
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
    return PkgDslPackage.Literals.DC_TIMING_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.DC_TIMING_EXPRESSION__DEFINE, oldDefine, define));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.DC_TIMING_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.DC_TIMING_EXPRESSION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.DC_TIMING_EXPRESSION__VALUE, oldValue, value));
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
      case PkgDslPackage.DC_TIMING_EXPRESSION__DEFINE:
        return getDefine();
      case PkgDslPackage.DC_TIMING_EXPRESSION__NAME:
        return getName();
      case PkgDslPackage.DC_TIMING_EXPRESSION__TYPE:
        return getType();
      case PkgDslPackage.DC_TIMING_EXPRESSION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PkgDslPackage.DC_TIMING_EXPRESSION__DEFINE:
        setDefine((String)newValue);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__TYPE:
        setType((String)newValue);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__VALUE:
        setValue((String)newValue);
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
      case PkgDslPackage.DC_TIMING_EXPRESSION__DEFINE:
        setDefine(DEFINE_EDEFAULT);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PkgDslPackage.DC_TIMING_EXPRESSION__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case PkgDslPackage.DC_TIMING_EXPRESSION__DEFINE:
        return DEFINE_EDEFAULT == null ? define != null : !DEFINE_EDEFAULT.equals(define);
      case PkgDslPackage.DC_TIMING_EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PkgDslPackage.DC_TIMING_EXPRESSION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case PkgDslPackage.DC_TIMING_EXPRESSION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(", name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //DC_TimingExpressionImpl