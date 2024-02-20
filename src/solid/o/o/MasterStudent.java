package solid.o.o;

public class MasterStudent implements Master {
    private String name;

    public MasterStudent(String name) {

        this.name = name;
    }

    Listener message = new Listener() {
        @Override
        public String message(String message) {
            return name + message;
        }
    };


    @Override
    public String direction() {
        return message.message(" conducts house building and repair works");
    }
}
