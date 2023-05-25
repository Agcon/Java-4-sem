package task3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockList<E> implements List<E> {
    private final Lock lock = new ReentrantLock();
    private final List<E> list = new ArrayList<E>();

    public boolean add(E e) {
        lock.lock();
        try {
            list.add(e);
        } finally {
            lock.unlock();
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    public void add(int index, E element) {
        lock.lock();
        try {
            list.add(index, element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }

    public boolean addAll(Collection<? extends E> c) {
        lock.lock();
        try {
            return list.addAll(c);
        } finally {
            lock.unlock();
        }
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        lock.lock();
        try {
            return list.addAll(index, c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        lock.lock();
        try {
            list.clear();
        } finally {
            lock.unlock();
        }
    }

    public boolean contains(Object o) {
        lock.lock();
        try {
            return list.contains(o);
        } finally {
            lock.unlock();
        }
    }

    public boolean containsAll(Collection<?> c) {
        lock.lock();
        try {
            return list.containsAll(c);
        } finally {
            lock.unlock();
        }
    }

    public E get(int index) {
        lock.lock();
        try {
            return list.get(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    public int indexOf(Object o) {
        lock.lock();
        try {
            return list.indexOf(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        lock.lock();
        try {
            return list.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    public Iterator<E> iterator() {
        lock.lock();
        try {
            return list.iterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public int lastIndexOf(Object o) {
        lock.lock();
        try {
            return list.lastIndexOf(o);
        } finally {
            lock.unlock();
        }
    }

    public ListIterator<E> listIterator() {
        lock.lock();
        try {
            return list.listIterator();
        } finally {
            lock.unlock();
        }
    }

    public ListIterator<E> listIterator(int index) {
        lock.lock();
        try {
            return list.listIterator(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
