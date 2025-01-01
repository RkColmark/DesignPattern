public class Thali {

    private boolean rice;

    private boolean dal;

    private boolean achar;

    private boolean chach;

    private boolean papad;

    private boolean chicken;

    private boolean mutton;

    private boolean fish;

    private boolean panner;

    private boolean mushroom;

    private boolean gobi;

    private boolean bhendi;

    private boolean khir;

    private boolean gulabJamun;

    public Thali(CustomThali customThali) {
        this.rice = customThali.rice;
        this.dal = customThali.dal;
        this.achar = customThali.achar;
        this.chach = customThali.chach;
        this.papad = customThali.papad;
        this.chicken = customThali.chicken;
        this.mutton = customThali.mutton;
        this.fish = customThali.fish;
        this.panner = customThali.panner;
        this.mushroom = customThali.mushroom;
        this.gobi = customThali.gobi;
        this.bhendi =customThali. bhendi;
        this.khir = customThali.khir;
    }

    public boolean getRice() {
        return rice;
    }

    public void setRice(boolean rice) {
        this.rice = rice;
    }

    public boolean getDal() {
        return dal;
    }

    public void setDal(boolean dal) {
        this.dal = dal;
    }

    public boolean getAchar() {
        return achar;
    }

    public void setAchar(boolean achar) {
        this.achar = achar;
    }

    public boolean getChach() {
        return chach;
    }

    public void setChach(boolean chach) {
        this.chach = chach;
    }

    public boolean getPapad() {
        return papad;
    }

    public void setPapad(boolean papad) {
        this.papad = papad;
    }

    public boolean getChicken() {
        return chicken;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public boolean getMutton() {
        return mutton;
    }

    public void setMutton(boolean mutton) {
        this.mutton = mutton;
    }

    public boolean getFish() {
        return fish;
    }

    public void setFish(boolean fish) {
        this.fish = fish;
    }

    public boolean getPanner() {
        return panner;
    }

    public void setPanner(boolean panner) {
        this.panner = panner;
    }

    public boolean getMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    public boolean getGobi() {
        return gobi;
    }

    public void setGobi(boolean gobi) {
        this.gobi = gobi;
    }

    public boolean getBhendi() {
        return bhendi;
    }

    public void setBhendi(boolean bhendi) {
        this.bhendi = bhendi;
    }

    public boolean getKhir() {
        return khir;
    }

    public void setKhir(boolean khir) {
        this.khir = khir;
    }

    public boolean getGulabJamun() {
        return gulabJamun;
    }

    public void setGulabJamun(boolean gulabJamun) {
        this.gulabJamun = gulabJamun;
    }

    public static class CustomThali
    {
        private boolean rice;

        private boolean dal;

        private boolean achar;

        private boolean chach;

        private boolean papad;

        private boolean chicken;

        private boolean mutton;

        private boolean fish;

        private boolean panner;

        private boolean mushroom;

        private boolean gobi;

        private boolean bhendi;

        private  boolean khir;

        private boolean gulabJamun;

        public CustomThali(boolean rice, boolean dal, boolean achar, boolean chach, boolean papad) {
            this.rice = rice;
            this.dal = dal;
            this.achar = achar;
            this.chach = chach;
            this.papad = papad;
        }

        public CustomThali setChicken(boolean chicken) {
            this.chicken = chicken;
            return this;
        }

        public CustomThali setMutton(boolean mutton) {
            this.mutton = mutton;
            return this;
        }

        public CustomThali setFish(boolean fish) {
            this.fish = fish;
            return this;
        }

        public CustomThali setPanner(boolean panner) {
            this.panner = panner;
            return this;
        }

        public CustomThali setMushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public CustomThali setGobi(boolean gobi) {
            this.gobi = gobi;
            return this;
        }

        public CustomThali setBhendi(boolean bhendi) {
            this.bhendi = bhendi;
            return this;
        }

        public CustomThali setKhir(boolean khir) {
            this.khir = khir;
            return this;
        }

        public CustomThali setGulabJamun(boolean gulabJamun) {
            this.gulabJamun = gulabJamun;
            return this;
        }

        public Thali build(){

            return new Thali(this);
        }
    }

    @Override
    public String toString() {
        return "Thali{" +
                "rice=" + rice +
                ", dal=" + dal +
                ", achar=" + achar +
                ", chach=" + chach +
                ", papad=" + papad +
                ", chicken=" + chicken +
                ", mutton=" + mutton +
                ", fish=" + fish +
                ", panner=" + panner +
                ", mushroom=" + mushroom +
                ", gobi=" + gobi +
                ", bhendi=" + bhendi +
                ", khir=" + khir +
                ", gulabJamun=" + gulabJamun +
                '}';
    }
}
