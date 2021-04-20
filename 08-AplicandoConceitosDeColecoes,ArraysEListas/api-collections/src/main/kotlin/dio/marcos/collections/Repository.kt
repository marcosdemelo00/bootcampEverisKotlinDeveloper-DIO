package dio.marcos.collections

class Repository<T> {                                           //-> T é um generics, representa/recebe o tipo do objeto que vai se trabalhar
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value                                         //-> ou map.put(id, value)
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map.get(id)

    fun findAll() = map.values
}