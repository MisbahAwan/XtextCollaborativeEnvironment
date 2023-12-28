/**
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.pkgDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webdsl.epackage.pkgdsl.pkgDsl.Order_Constraint;
import webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getShortname <em>Shortname</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.Order_ConstraintImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Order_ConstraintImpl extends MinimalEObjectImpl.Container implements Order_Constraint
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
   * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUuid()
   * @generated
   * @ordered
   */
  protected static final String UUID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUuid()
   * @generated
   * @ordered
   */
  protected String uuid = UUID_EDEFAULT;

  /**
   * The default value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname()
   * @generated
   * @ordered
   */
  protected static final String SHORTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortname() <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortname()
   * @generated
   * @ordered
   */
  protected String shortname = SHORTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected String category = CATEGORY_EDEFAULT;

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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Order_ConstraintImpl()
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
    return PkgDslPackage.Literals.ORDER_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__DEFINE, oldDefine, define));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUuid()
  {
    return uuid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUuid(String newUuid)
  {
    String oldUuid = uuid;
    uuid = newUuid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__UUID, oldUuid, uuid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getShortname()
  {
    return shortname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setShortname(String newShortname)
  {
    String oldShortname = shortname;
    shortname = newShortname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__SHORTNAME, oldShortname, shortname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCategory(String newCategory)
  {
    String oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.ORDER_CONSTRAINT__SOURCE, oldSource, source));
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
      case PkgDslPackage.ORDER_CONSTRAINT__DEFINE:
        return getDefine();
      case PkgDslPackage.ORDER_CONSTRAINT__UUID:
        return getUuid();
      case PkgDslPackage.ORDER_CONSTRAINT__SHORTNAME:
        return getShortname();
      case PkgDslPackage.ORDER_CONSTRAINT__CATEGORY:
        return getCategory();
      case PkgDslPackage.ORDER_CONSTRAINT__NAME:
        return getName();
      case PkgDslPackage.ORDER_CONSTRAINT__TARGET:
        return getTarget();
      case PkgDslPackage.ORDER_CONSTRAINT__SOURCE:
        return getSource();
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
      case PkgDslPackage.ORDER_CONSTRAINT__DEFINE:
        setDefine((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__UUID:
        setUuid((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__SHORTNAME:
        setShortname((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__CATEGORY:
        setCategory((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__NAME:
        setName((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__TARGET:
        setTarget((String)newValue);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__SOURCE:
        setSource((String)newValue);
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
      case PkgDslPackage.ORDER_CONSTRAINT__DEFINE:
        setDefine(DEFINE_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__UUID:
        setUuid(UUID_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__SHORTNAME:
        setShortname(SHORTNAME_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__CATEGORY:
        setCategory(CATEGORY_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case PkgDslPackage.ORDER_CONSTRAINT__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case PkgDslPackage.ORDER_CONSTRAINT__DEFINE:
        return DEFINE_EDEFAULT == null ? define != null : !DEFINE_EDEFAULT.equals(define);
      case PkgDslPackage.ORDER_CONSTRAINT__UUID:
        return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
      case PkgDslPackage.ORDER_CONSTRAINT__SHORTNAME:
        return SHORTNAME_EDEFAULT == null ? shortname != null : !SHORTNAME_EDEFAULT.equals(shortname);
      case PkgDslPackage.ORDER_CONSTRAINT__CATEGORY:
        return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
      case PkgDslPackage.ORDER_CONSTRAINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PkgDslPackage.ORDER_CONSTRAINT__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case PkgDslPackage.ORDER_CONSTRAINT__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
    result.append(", uuid: ");
    result.append(uuid);
    result.append(", shortname: ");
    result.append(shortname);
    result.append(", category: ");
    result.append(category);
    result.append(", name: ");
    result.append(name);
    result.append(", target: ");
    result.append(target);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //Order_ConstraintImpl
