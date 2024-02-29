package lesson18.example1;

import java.util.ArrayList;

public class ATM {


    private MessageInterface messageInterface=null;
    private ShowAmountInfoInterface showAmountInfoInterface=null;
    ArrayList<Money> lists = new ArrayList<>();

    void addMoneys(ArrayList<Money> moneys) {
        if(!lists.contains(moneys))
            lists.addAll(moneys);
        else{
            lists.get(moneys.indexOf(PUL.AAAA));
        }
    }
    private boolean hasMessageInterface(){
        return messageInterface!=null;
    }
    private boolean  hasShowMoneyInfoInterface(){
        return showAmountInfoInterface!=null;
    }


    public void setMessageInterface(MessageInterface messageInterface){
        if(!hasMessageInterface()){
            this.messageInterface=messageInterface;
        }
        lists.get(lists.indexOf(messageInterface));
    }

    void setShowMoneyInfoInterface(ShowAmountInfoInterface showMoneyInfoInterface){
        if(!hasShowMoneyInfoInterface()){
            this.showAmountInfoInterface=showMoneyInfoInterface;
        }else{

        }
    }
    void isGetMoney(int getSumm){



    }

    @Override
    public String toString() {
        return "ATM{" +
                ", showAmountInfoInterface=" + showAmountInfoInterface +
                ", lists=" + lists +
                '}';
    }
}
