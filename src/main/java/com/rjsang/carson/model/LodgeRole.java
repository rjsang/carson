package com.rjsang.carson.model;

/**
 * Defines a relationship between a {@link Brother} and a {@link Lodge}
 *
 * @author rjsang
 */
public class LodgeRole
{

  public static enum RoleType
  {

    ADMIN

  }

  private Brother brother;

  private Lodge lodge;

  private RoleType roleType;

}
