package intensive.Homeworks.Homework5.Proxy;

class RealImage implements Image {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Загрузка " + filename);
    }
    public void display() {
        System.out.println("Просмотр " + filename);
    }
}
