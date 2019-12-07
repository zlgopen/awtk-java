package awtk;


public enum EasingType {
  LINEAR (EASING_LINEAR()),
  QUADRATIC_IN (EASING_QUADRATIC_IN()),
  QUADRATIC_OUT (EASING_QUADRATIC_OUT()),
  QUADRATIC_INOUT (EASING_QUADRATIC_INOUT()),
  CUBIC_IN (EASING_CUBIC_IN()),
  CUBIC_OUT (EASING_CUBIC_OUT()),
  SIN_IN (EASING_SIN_IN()),
  SIN_OUT (EASING_SIN_OUT()),
  SIN_INOUT (EASING_SIN_INOUT()),
  POW_IN (EASING_POW_IN()),
  POW_OUT (EASING_POW_OUT()),
  POW_INOUT (EASING_POW_INOUT()),
  CIRCULAR_IN (EASING_CIRCULAR_IN()),
  CIRCULAR_OUT (EASING_CIRCULAR_OUT()),
  CIRCULAR_INOUT (EASING_CIRCULAR_INOUT()),
  ELASTIC_IN (EASING_ELASTIC_IN()),
  ELASTIC_OUT (EASING_ELASTIC_OUT()),
  ELASTIC_INOUT (EASING_ELASTIC_INOUT()),
  BACK_IN (EASING_BACK_IN()),
  BACK_OUT (EASING_BACK_OUT()),
  BACK_INOUT (EASING_BACK_INOUT()),
  BOUNCE_IN (EASING_BOUNCE_IN()),
  BOUNCE_OUT (EASING_BOUNCE_OUT()),
  BOUNCE_INOUT (EASING_BOUNCE_INOUT());
 
   
  private int value;
  EasingType(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static EasingType from(int value) {
    for(EasingType iter : EasingType.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return LINEAR;
  }

  static private native int EASING_LINEAR();
  static private native int EASING_QUADRATIC_IN();
  static private native int EASING_QUADRATIC_OUT();
  static private native int EASING_QUADRATIC_INOUT();
  static private native int EASING_CUBIC_IN();
  static private native int EASING_CUBIC_OUT();
  static private native int EASING_SIN_IN();
  static private native int EASING_SIN_OUT();
  static private native int EASING_SIN_INOUT();
  static private native int EASING_POW_IN();
  static private native int EASING_POW_OUT();
  static private native int EASING_POW_INOUT();
  static private native int EASING_CIRCULAR_IN();
  static private native int EASING_CIRCULAR_OUT();
  static private native int EASING_CIRCULAR_INOUT();
  static private native int EASING_ELASTIC_IN();
  static private native int EASING_ELASTIC_OUT();
  static private native int EASING_ELASTIC_INOUT();
  static private native int EASING_BACK_IN();
  static private native int EASING_BACK_OUT();
  static private native int EASING_BACK_INOUT();
  static private native int EASING_BOUNCE_IN();
  static private native int EASING_BOUNCE_OUT();
  static private native int EASING_BOUNCE_INOUT();

}
