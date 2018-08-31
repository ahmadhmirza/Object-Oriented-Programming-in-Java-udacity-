public class Contact {
    //Fields
        private int ID=0;
        private String name;
        private String email;
        private String phoneNumber;

        public void setName(String name){
                this.name = name;
                setID();
        }
        public void setEmail(String email){
                this.email=email;
        }
        public void setNumber(String phoneNumber){
                this.phoneNumber=phoneNumber;
        }
        private void setID(){
                ID=ID+1;
        }
        public int returnID(){
                return ID;
        }
        public String getName(){
                return name;
        }
        public String getEmail(){
                return email;
        }
        public String getNumber(){
                return phoneNumber;
        }
}
