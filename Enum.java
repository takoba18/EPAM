public class Enum {
    public enum Candidate {
        HIRED("This candidate was hired") {
            @Override
            public boolean isHired() {
                return true;
            }
        },
        REJECTED("This candidate was rejected") {
            @Override
            public boolean isRejected() {
                return true;
            }
        };
        private String status;

        Candidate(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isHired() {
            return false;
        }

        public boolean isRejected() {
            return false;
        }

        class SendMail {
            static void sendRejection() {
                System.out.println("You have not be chosen for this role");
            }

            static void sendAcceptance() {
                System.out.println("You have been chosen for this role");
            }
        }
    }

    public static void main(String[] args) {
        Candidate candidate = Candidate.HIRED;
        switch (candidate) {
            case HIRED:
                Candidate.SendMail.sendAcceptance();
                break;
            case REJECTED:
                Candidate.SendMail.sendRejection();
                break;
        }
    }
}
