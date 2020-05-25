package me.study.exception_handling;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false); // 예외 발생 안함
        } catch(WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); // 예외 발생
        } catch(WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork"+exception+")가 호출됨");

        if (exception)
            throw new WorkException("WorkException 발생!!!");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException 발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}
class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}
