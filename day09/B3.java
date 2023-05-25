public class B3 {
    private static void mMy() throws MyException{
        throw new MyException();
    }
    private static void mYour() throws YourException {
        throw new YourException();
    }
    private static void mEx() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws MyException, YourException, Exception {
        System.out.print("MyException first: ");
        try {
            mMy();
            mYour();
            mEx();
        } catch (MyException me) {
            System.out.println(me);
        } catch (YourException ye) {
            System.out.println(ye);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print("YourException first: ");
        try {
            mYour();
            mMy();
            mEx();
        } catch (MyException me) {
            System.out.println(me);
        } catch (YourException ye) {
            System.out.println(ye);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print("Throwing to main: ");
        mYour();
        mMy();
        mEx();
    }
}
