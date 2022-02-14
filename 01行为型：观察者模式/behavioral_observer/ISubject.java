package behavioral_observer;

public interface ISubject {
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers();
}
