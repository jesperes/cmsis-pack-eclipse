/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read16</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.Read16#getAddr <em>Addr</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getRead16()
 * @model
 * @generated
 */
public interface Read16 extends Expression
{
  /**
   * Returns the value of the '<em><b>Addr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' containment reference.
   * @see #setAddr(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getRead16_Addr()
   * @model containment="true"
   * @generated
   */
  Expression getAddr();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.Read16#getAddr <em>Addr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' containment reference.
   * @see #getAddr()
   * @generated
   */
  void setAddr(Expression value);

} // Read16
