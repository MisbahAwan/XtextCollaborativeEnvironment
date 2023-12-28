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

import webdsl.epackage.pkgdsl.pkgDsl.EA_Package;
import webdsl.epackage.pkgdsl.pkgDsl.Elements;
import webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage;
import webdsl.epackage.pkgdsl.pkgDsl.Sub_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getDefine <em>Define</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getShortname <em>Shortname</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.impl.EA_PackageImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EA_PackageImpl extends MinimalEObjectImpl.Container implements EA_Package
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
   * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubpackages()
   * @generated
   * @ordered
   */
  protected EList<Sub_Package> subpackages;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Elements> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EA_PackageImpl()
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
    return PkgDslPackage.Literals.EA_PACKAGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.EA_PACKAGE__DEFINE, oldDefine, define));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.EA_PACKAGE__UUID, oldUuid, uuid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.EA_PACKAGE__SHORTNAME, oldShortname, shortname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.EA_PACKAGE__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PkgDslPackage.EA_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sub_Package> getSubpackages()
  {
    if (subpackages == null)
    {
      subpackages = new EObjectContainmentEList<Sub_Package>(Sub_Package.class, this, PkgDslPackage.EA_PACKAGE__SUBPACKAGES);
    }
    return subpackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Elements> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Elements>(Elements.class, this, PkgDslPackage.EA_PACKAGE__ELEMENTS);
    }
    return elements;
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
      case PkgDslPackage.EA_PACKAGE__SUBPACKAGES:
        return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
      case PkgDslPackage.EA_PACKAGE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case PkgDslPackage.EA_PACKAGE__DEFINE:
        return getDefine();
      case PkgDslPackage.EA_PACKAGE__UUID:
        return getUuid();
      case PkgDslPackage.EA_PACKAGE__SHORTNAME:
        return getShortname();
      case PkgDslPackage.EA_PACKAGE__CATEGORY:
        return getCategory();
      case PkgDslPackage.EA_PACKAGE__NAME:
        return getName();
      case PkgDslPackage.EA_PACKAGE__SUBPACKAGES:
        return getSubpackages();
      case PkgDslPackage.EA_PACKAGE__ELEMENTS:
        return getElements();
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
      case PkgDslPackage.EA_PACKAGE__DEFINE:
        setDefine((String)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__UUID:
        setUuid((String)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__SHORTNAME:
        setShortname((String)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__CATEGORY:
        setCategory((String)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__SUBPACKAGES:
        getSubpackages().clear();
        getSubpackages().addAll((Collection<? extends Sub_Package>)newValue);
        return;
      case PkgDslPackage.EA_PACKAGE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Elements>)newValue);
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
      case PkgDslPackage.EA_PACKAGE__DEFINE:
        setDefine(DEFINE_EDEFAULT);
        return;
      case PkgDslPackage.EA_PACKAGE__UUID:
        setUuid(UUID_EDEFAULT);
        return;
      case PkgDslPackage.EA_PACKAGE__SHORTNAME:
        setShortname(SHORTNAME_EDEFAULT);
        return;
      case PkgDslPackage.EA_PACKAGE__CATEGORY:
        setCategory(CATEGORY_EDEFAULT);
        return;
      case PkgDslPackage.EA_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PkgDslPackage.EA_PACKAGE__SUBPACKAGES:
        getSubpackages().clear();
        return;
      case PkgDslPackage.EA_PACKAGE__ELEMENTS:
        getElements().clear();
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
      case PkgDslPackage.EA_PACKAGE__DEFINE:
        return DEFINE_EDEFAULT == null ? define != null : !DEFINE_EDEFAULT.equals(define);
      case PkgDslPackage.EA_PACKAGE__UUID:
        return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
      case PkgDslPackage.EA_PACKAGE__SHORTNAME:
        return SHORTNAME_EDEFAULT == null ? shortname != null : !SHORTNAME_EDEFAULT.equals(shortname);
      case PkgDslPackage.EA_PACKAGE__CATEGORY:
        return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
      case PkgDslPackage.EA_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PkgDslPackage.EA_PACKAGE__SUBPACKAGES:
        return subpackages != null && !subpackages.isEmpty();
      case PkgDslPackage.EA_PACKAGE__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //EA_PackageImpl
