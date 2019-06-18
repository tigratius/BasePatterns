package main.java.com.tigratius.basepatterns.behavioral.iterator;


public class Car implements Collection {

    private String name;
    private String[] upgrades;

    public Car(String name, String[] upgrades) {
        this.name = name;
        this.upgrades = upgrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(String[] upgrades) {
        this.upgrades = upgrades;
    }

    @Override
    public Iterator getIterator() {
        return new UpgradeIterator();
    }

    private class UpgradeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if (index < upgrades.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            return upgrades[index++];
        }
    }
}
