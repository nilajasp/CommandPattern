/**
 * Created by nilajapatankar on 2/16/15.
 */
public class AddCommand implements ICommand {
    private Receiver _receiver;

    public AddCommand(Receiver receiver) {
        _receiver = receiver;
    }

    @Override
    public void Execute() {
        _receiver.Result = _receiver.Number1 + _receiver.Number2;
        System.out.println("Addition result is : "+_receiver.Result);
    }
}
