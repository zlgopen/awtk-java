package awtk;


public enum KeyCode {
  KEY_RETURN (TK_KEY_RETURN()),
  KEY_ESCAPE (TK_KEY_ESCAPE()),
  KEY_BACKSPACE (TK_KEY_BACKSPACE()),
  KEY_TAB (TK_KEY_TAB()),
  KEY_SPACE (TK_KEY_SPACE()),
  KEY_EXCLAIM (TK_KEY_EXCLAIM()),
  KEY_QUOTEDBL (TK_KEY_QUOTEDBL()),
  KEY_HASH (TK_KEY_HASH()),
  KEY_PERCENT (TK_KEY_PERCENT()),
  KEY_DOLLAR (TK_KEY_DOLLAR()),
  KEY_AMPERSAND (TK_KEY_AMPERSAND()),
  KEY_QUOTE (TK_KEY_QUOTE()),
  KEY_LEFTPAREN (TK_KEY_LEFTPAREN()),
  KEY_RIGHTPAREN (TK_KEY_RIGHTPAREN()),
  KEY_ASTERISK (TK_KEY_ASTERISK()),
  KEY_PLUS (TK_KEY_PLUS()),
  KEY_COMMA (TK_KEY_COMMA()),
  KEY_MINUS (TK_KEY_MINUS()),
  KEY_PERIOD (TK_KEY_PERIOD()),
  KEY_SLASH (TK_KEY_SLASH()),
  KEY_0 (TK_KEY_0()),
  KEY_1 (TK_KEY_1()),
  KEY_2 (TK_KEY_2()),
  KEY_3 (TK_KEY_3()),
  KEY_4 (TK_KEY_4()),
  KEY_5 (TK_KEY_5()),
  KEY_6 (TK_KEY_6()),
  KEY_7 (TK_KEY_7()),
  KEY_8 (TK_KEY_8()),
  KEY_9 (TK_KEY_9()),
  KEY_COLON (TK_KEY_COLON()),
  KEY_SEMICOLON (TK_KEY_SEMICOLON()),
  KEY_LESS (TK_KEY_LESS()),
  KEY_EQUAL (TK_KEY_EQUAL()),
  KEY_GREATER (TK_KEY_GREATER()),
  KEY_QUESTION (TK_KEY_QUESTION()),
  KEY_AT (TK_KEY_AT()),
  KEY_LEFTBRACKET (TK_KEY_LEFTBRACKET()),
  KEY_BACKSLASH (TK_KEY_BACKSLASH()),
  KEY_RIGHTBRACKET (TK_KEY_RIGHTBRACKET()),
  KEY_CARET (TK_KEY_CARET()),
  KEY_UNDERSCORE (TK_KEY_UNDERSCORE()),
  KEY_BACKQUOTE (TK_KEY_BACKQUOTE()),
  KEY_a (TK_KEY_a()),
  KEY_b (TK_KEY_b()),
  KEY_c (TK_KEY_c()),
  KEY_d (TK_KEY_d()),
  KEY_e (TK_KEY_e()),
  KEY_f (TK_KEY_f()),
  KEY_g (TK_KEY_g()),
  KEY_h (TK_KEY_h()),
  KEY_i (TK_KEY_i()),
  KEY_j (TK_KEY_j()),
  KEY_k (TK_KEY_k()),
  KEY_l (TK_KEY_l()),
  KEY_m (TK_KEY_m()),
  KEY_n (TK_KEY_n()),
  KEY_o (TK_KEY_o()),
  KEY_p (TK_KEY_p()),
  KEY_q (TK_KEY_q()),
  KEY_r (TK_KEY_r()),
  KEY_s (TK_KEY_s()),
  KEY_t (TK_KEY_t()),
  KEY_u (TK_KEY_u()),
  KEY_v (TK_KEY_v()),
  KEY_w (TK_KEY_w()),
  KEY_x (TK_KEY_x()),
  KEY_y (TK_KEY_y()),
  KEY_z (TK_KEY_z()),
  KEY_A (TK_KEY_A()),
  KEY_B (TK_KEY_B()),
  KEY_C (TK_KEY_C()),
  KEY_D (TK_KEY_D()),
  KEY_E (TK_KEY_E()),
  KEY_F (TK_KEY_F()),
  KEY_G (TK_KEY_G()),
  KEY_H (TK_KEY_H()),
  KEY_I (TK_KEY_I()),
  KEY_J (TK_KEY_J()),
  KEY_K (TK_KEY_K()),
  KEY_L (TK_KEY_L()),
  KEY_M (TK_KEY_M()),
  KEY_N (TK_KEY_N()),
  KEY_O (TK_KEY_O()),
  KEY_P (TK_KEY_P()),
  KEY_Q (TK_KEY_Q()),
  KEY_R (TK_KEY_R()),
  KEY_S (TK_KEY_S()),
  KEY_T (TK_KEY_T()),
  KEY_U (TK_KEY_U()),
  KEY_V (TK_KEY_V()),
  KEY_W (TK_KEY_W()),
  KEY_X (TK_KEY_X()),
  KEY_Y (TK_KEY_Y()),
  KEY_Z (TK_KEY_Z()),
  KEY_DOT (TK_KEY_DOT()),
  KEY_DELETE (TK_KEY_DELETE()),
  KEY_LEFTBRACE (TK_KEY_LEFTBRACE()),
  KEY_RIGHTBRACE (TK_KEY_RIGHTBRACE()),
  KEY_LSHIFT (TK_KEY_LSHIFT()),
  KEY_RSHIFT (TK_KEY_RSHIFT()),
  KEY_LCTRL (TK_KEY_LCTRL()),
  KEY_RCTRL (TK_KEY_RCTRL()),
  KEY_LALT (TK_KEY_LALT()),
  KEY_RALT (TK_KEY_RALT()),
  KEY_CAPSLOCK (TK_KEY_CAPSLOCK()),
  KEY_HOME (TK_KEY_HOME()),
  KEY_END (TK_KEY_END()),
  KEY_INSERT (TK_KEY_INSERT()),
  KEY_UP (TK_KEY_UP()),
  KEY_DOWN (TK_KEY_DOWN()),
  KEY_LEFT (TK_KEY_LEFT()),
  KEY_RIGHT (TK_KEY_RIGHT()),
  KEY_PAGEUP (TK_KEY_PAGEUP()),
  KEY_PAGEDOWN (TK_KEY_PAGEDOWN()),
  KEY_F1 (TK_KEY_F1()),
  KEY_F2 (TK_KEY_F2()),
  KEY_F3 (TK_KEY_F3()),
  KEY_F4 (TK_KEY_F4()),
  KEY_F5 (TK_KEY_F5()),
  KEY_F6 (TK_KEY_F6()),
  KEY_F7 (TK_KEY_F7()),
  KEY_F8 (TK_KEY_F8()),
  KEY_F9 (TK_KEY_F9()),
  KEY_F10 (TK_KEY_F10()),
  KEY_F11 (TK_KEY_F11()),
  KEY_F12 (TK_KEY_F12()),
  KEY_MENU (TK_KEY_MENU()),
  KEY_COMMAND (TK_KEY_COMMAND()),
  KEY_BACK (TK_KEY_BACK()),
  KEY_CANCEL (TK_KEY_CANCEL());
 
   
  private int value;
  KeyCode(int value) {
    this.value = value;
  }
  public int value() {
    return this.value;
  }

  public static KeyCode from(int value) {
    for(KeyCode iter : KeyCode.values()) {
      if(iter.value() == value) {
        return iter;
      }
    }

    return KEY_RETURN;
  }

  static private native int TK_KEY_RETURN();
  static private native int TK_KEY_ESCAPE();
  static private native int TK_KEY_BACKSPACE();
  static private native int TK_KEY_TAB();
  static private native int TK_KEY_SPACE();
  static private native int TK_KEY_EXCLAIM();
  static private native int TK_KEY_QUOTEDBL();
  static private native int TK_KEY_HASH();
  static private native int TK_KEY_PERCENT();
  static private native int TK_KEY_DOLLAR();
  static private native int TK_KEY_AMPERSAND();
  static private native int TK_KEY_QUOTE();
  static private native int TK_KEY_LEFTPAREN();
  static private native int TK_KEY_RIGHTPAREN();
  static private native int TK_KEY_ASTERISK();
  static private native int TK_KEY_PLUS();
  static private native int TK_KEY_COMMA();
  static private native int TK_KEY_MINUS();
  static private native int TK_KEY_PERIOD();
  static private native int TK_KEY_SLASH();
  static private native int TK_KEY_0();
  static private native int TK_KEY_1();
  static private native int TK_KEY_2();
  static private native int TK_KEY_3();
  static private native int TK_KEY_4();
  static private native int TK_KEY_5();
  static private native int TK_KEY_6();
  static private native int TK_KEY_7();
  static private native int TK_KEY_8();
  static private native int TK_KEY_9();
  static private native int TK_KEY_COLON();
  static private native int TK_KEY_SEMICOLON();
  static private native int TK_KEY_LESS();
  static private native int TK_KEY_EQUAL();
  static private native int TK_KEY_GREATER();
  static private native int TK_KEY_QUESTION();
  static private native int TK_KEY_AT();
  static private native int TK_KEY_LEFTBRACKET();
  static private native int TK_KEY_BACKSLASH();
  static private native int TK_KEY_RIGHTBRACKET();
  static private native int TK_KEY_CARET();
  static private native int TK_KEY_UNDERSCORE();
  static private native int TK_KEY_BACKQUOTE();
  static private native int TK_KEY_a();
  static private native int TK_KEY_b();
  static private native int TK_KEY_c();
  static private native int TK_KEY_d();
  static private native int TK_KEY_e();
  static private native int TK_KEY_f();
  static private native int TK_KEY_g();
  static private native int TK_KEY_h();
  static private native int TK_KEY_i();
  static private native int TK_KEY_j();
  static private native int TK_KEY_k();
  static private native int TK_KEY_l();
  static private native int TK_KEY_m();
  static private native int TK_KEY_n();
  static private native int TK_KEY_o();
  static private native int TK_KEY_p();
  static private native int TK_KEY_q();
  static private native int TK_KEY_r();
  static private native int TK_KEY_s();
  static private native int TK_KEY_t();
  static private native int TK_KEY_u();
  static private native int TK_KEY_v();
  static private native int TK_KEY_w();
  static private native int TK_KEY_x();
  static private native int TK_KEY_y();
  static private native int TK_KEY_z();
  static private native int TK_KEY_A();
  static private native int TK_KEY_B();
  static private native int TK_KEY_C();
  static private native int TK_KEY_D();
  static private native int TK_KEY_E();
  static private native int TK_KEY_F();
  static private native int TK_KEY_G();
  static private native int TK_KEY_H();
  static private native int TK_KEY_I();
  static private native int TK_KEY_J();
  static private native int TK_KEY_K();
  static private native int TK_KEY_L();
  static private native int TK_KEY_M();
  static private native int TK_KEY_N();
  static private native int TK_KEY_O();
  static private native int TK_KEY_P();
  static private native int TK_KEY_Q();
  static private native int TK_KEY_R();
  static private native int TK_KEY_S();
  static private native int TK_KEY_T();
  static private native int TK_KEY_U();
  static private native int TK_KEY_V();
  static private native int TK_KEY_W();
  static private native int TK_KEY_X();
  static private native int TK_KEY_Y();
  static private native int TK_KEY_Z();
  static private native int TK_KEY_DOT();
  static private native int TK_KEY_DELETE();
  static private native int TK_KEY_LEFTBRACE();
  static private native int TK_KEY_RIGHTBRACE();
  static private native int TK_KEY_LSHIFT();
  static private native int TK_KEY_RSHIFT();
  static private native int TK_KEY_LCTRL();
  static private native int TK_KEY_RCTRL();
  static private native int TK_KEY_LALT();
  static private native int TK_KEY_RALT();
  static private native int TK_KEY_CAPSLOCK();
  static private native int TK_KEY_HOME();
  static private native int TK_KEY_END();
  static private native int TK_KEY_INSERT();
  static private native int TK_KEY_UP();
  static private native int TK_KEY_DOWN();
  static private native int TK_KEY_LEFT();
  static private native int TK_KEY_RIGHT();
  static private native int TK_KEY_PAGEUP();
  static private native int TK_KEY_PAGEDOWN();
  static private native int TK_KEY_F1();
  static private native int TK_KEY_F2();
  static private native int TK_KEY_F3();
  static private native int TK_KEY_F4();
  static private native int TK_KEY_F5();
  static private native int TK_KEY_F6();
  static private native int TK_KEY_F7();
  static private native int TK_KEY_F8();
  static private native int TK_KEY_F9();
  static private native int TK_KEY_F10();
  static private native int TK_KEY_F11();
  static private native int TK_KEY_F12();
  static private native int TK_KEY_MENU();
  static private native int TK_KEY_COMMAND();
  static private native int TK_KEY_BACK();
  static private native int TK_KEY_CANCEL();

}
