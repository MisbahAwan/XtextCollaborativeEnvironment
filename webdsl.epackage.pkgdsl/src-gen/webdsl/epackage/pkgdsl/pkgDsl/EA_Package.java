/**
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.pkgDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getDefine <em>Define</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getUuid <em>Uuid</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getShortname <em>Shortname</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getCategory <em>Category</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getName <em>Name</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package()
 * @model
 * @generated
 */
public interface EA_Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Define</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Define</em>' attribute.
   * @see #setDefine(String)
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Define()
   * @model
   * @generated
   */
  String getDefine();

  /**
   * Sets the value of the '{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getDefine <em>Define</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Define</em>' attribute.
   * @see #getDefine()
   * @generated
   */
  void setDefine(String value);

  /**
   * Returns the value of the '<em><b>Uuid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uuid</em>' attribute.
   * @see #setUuid(String)
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Uuid()
   * @model
   * @generated
   */
  String getUuid();

  /**
   * Sets the value of the '{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getUuid <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uuid</em>' attribute.
   * @see #getUuid()
   * @generated
   */
  void setUuid(String value);

  /**
   * Returns the value of the '<em><b>Shortname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shortname</em>' attribute.
   * @see #setShortname(String)
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Shortname()
   * @model
   * @generated
   */
  String getShortname();

  /**
   * Sets the value of the '{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getShortname <em>Shortname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shortname</em>' attribute.
   * @see #getShortname()
   * @generated
   */
  void setShortname(String value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see #setCategory(String)
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Category()
   * @model
   * @generated
   */
  String getCategory();

  /**
   * Sets the value of the '{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see #getCategory()
   * @generated
   */
  void setCategory(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link webdsl.epackage.pkgdsl.pkgDsl.EA_Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
   * The list contents are of type {@link webdsl.epackage.pkgdsl.pkgDsl.Sub_Package}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subpackages</em>' containment reference list.
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Subpackages()
   * @model containment="true"
   * @generated
   */
  EList<Sub_Package> getSubpackages();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link webdsl.epackage.pkgdsl.pkgDsl.Elements}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see webdsl.epackage.pkgdsl.pkgDsl.PkgDslPackage#getEA_Package_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Elements> getElements();

} // EA_Package