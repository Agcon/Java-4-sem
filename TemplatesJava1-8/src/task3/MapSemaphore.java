package task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MapSemaphore<K, V> implements Map<K, V> {
    private final Map<K, V> map = new HashMap<K, V>();
    private final Semaphore semaphore = new Semaphore(1);

    public V put(K key, V value) {
        try {
            semaphore.acquire();
            return map.put(key, value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public V get(Object key) {
        try {
            semaphore.acquire();
            return map.get(key);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public V remove(Object key) {
        try {
            semaphore.acquire();
            return map.remove(key);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        return;
    }

    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            return map.containsKey(key);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            return map.containsValue(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public int size() {
        try {
            semaphore.acquire();
            return map.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public boolean isEmpty() {
        try {
            semaphore.acquire();
            return map.isEmpty();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}