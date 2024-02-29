package solid.o.o;

public  class MasterTeacher implements Master{
    private String name;

    public MasterTeacher(String name) {
        this.name = name;
    }

    Listener message=new Listener() {
        @Override
        public String message(String message) {
            return name+ message;
        }
    };
    @Override
    public String direction() {
        return message.message(" he built the house from scratch");
    }
}
