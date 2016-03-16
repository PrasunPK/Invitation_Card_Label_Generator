package lib;

public class Pair<K, V> {
        private K key;
        private V value;

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public Pair(K var1, V var2) {
            this.key = var1;
            this.value = var2;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }
}
