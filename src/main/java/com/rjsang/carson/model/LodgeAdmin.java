package com.rjsang.carson.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Defines an admin relationship between a {@link Brother} and a {@link Lodge}
 *
 * @author rjsang
 */
@Entity
public class LodgeAdmin
{

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany
  private Brother brother;

  @OneToMany
  private Lodge lodge;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Brother getBrother()
  {
    return brother;
  }

  public void setBrother(Brother brother)
  {
    this.brother = brother;
  }

  public Lodge getLodge()
  {
    return lodge;
  }

  public void setLodge(Lodge lodge)
  {
    this.lodge = lodge;
  }

}
