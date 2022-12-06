package org.example7;
// 07-04 예외처리(Exception)

class FoolException extends Exception {

}

public class Sample4 {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample4 sample = new Sample4();
        try {
            sample.sayNick("fool");
            sample.sayNick("genious");
        } catch(FoolException e) {
            System.out.println("FoolException이 발생했습니다.");
        }
    }
}