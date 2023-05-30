class CC2 {
    final int I = 123; // 수정 방지
    final void m() {} // 오버라이딩 방지
    //final CC2() {} // syntax error, 생성자는 오버라이딩 개념이 없음
}

public class C2 extends CC2 {
    //void m() {} // parent class가 final이므로 불가능
}
