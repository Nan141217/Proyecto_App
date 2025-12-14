<<<<<<< HEAD
package data

import models.Animal
import models.Frase
import models.Fruits
import models.Usuario
import models.colors
import models.numbers

/**
 * Implementación en memoria del gestor de datos.
 * Utiliza el patrón Singleton (object) para mantener una única instancia.
 * Todos los datos se almacenan en memoria usando estructuras mutables.
 */
object MemoryDataManager : IDataManager {
    // ========== Almacenamiento de datos en memoria ==========
    private val animalsList = mutableListOf<Animal>()
    private val colorsList = mutableListOf<colors>()
    private val numbersList = mutableListOf<numbers>()
    private val fruitsList = mutableListOf<Fruits>()
    private val frasesList = mutableListOf<Frase>()
    private val usuariosMap = mutableMapOf<Int, Usuario>()

    // Usuario actual de la sesión
    private var usuarioActual: Usuario? = null

    // ========== Métodos existentes (sin modificar estructura) ==========
    override fun add(animal: Animal, colors: colors, fruits: Fruits, number: numbers) {
        addAnimal(animal)
        addColor(colors)
        addFruta(fruits)
        addNumero(number)
    }

    override fun addAnimal(animal: Animal) {
        if (!animalsList.any { it.id == animal.id }) {
            animalsList.add(animal)
        }
    }

    override fun addColor(color: colors) {
        if (!colorsList.any { it.id == color.id }) {
            colorsList.add(color)
        }
    }

    override fun addNumero(numero: numbers) {
        if (!numbersList.any { it.Id == numero.Id }) {
            numbersList.add(numero)
        }
    }

    override fun addFruta(fruta: Fruits) {
        if (!fruitsList.any { it.id == fruta.id }) {
            fruitsList.add(fruta)
        }
    }

    override fun upgrade(animal: Animal) {
        val index = animalsList.indexOfFirst { it.id == animal.id }
        if (index != -1) {
            animalsList[index] = animal
        }
    }

    override fun upgradeC(colors: colors) {
        val index = colorsList.indexOfFirst { it.id == colors.id }
        if (index != -1) {
            colorsList[index] = colors
        }
    }

    override fun upgradeF(fruits: Fruits) {
        val index = fruitsList.indexOfFirst { it.id == fruits.id }
        if (index != -1) {
            fruitsList[index] = fruits
        }
    }

    override fun upgradeN(number: numbers) {
        val index = numbersList.indexOfFirst { it.Id == number.Id }
        if (index != -1) {
            numbersList[index] = number
        }
    }

    // ========== Métodos de obtención de datos por categoría ==========
    override fun getAllAnimals(): List<Animal> = animalsList.toList()

    override fun getAllColors(): List<colors> = colorsList.toList()

    override fun getAllNumbers(): List<numbers> = numbersList.toList()

    override fun getAllFruits(): List<Fruits> = fruitsList.toList()

    override fun getAnimalById(id: Int): Animal? = animalsList.find { it.id == id }

    override fun getColorById(id: Int): colors? = colorsList.find { it.id == id }

    override fun getNumberById(id: Int): numbers? = numbersList.find { it.Id == id }

    override fun getFruitById(id: Int): Fruits? = fruitsList.find { it.id == id }

    // ========== Métodos para Frases ==========
    override fun getAllFrases(): List<Frase> = frasesList.toList()

    override fun getFraseById(id: Int): Frase? = frasesList.find { it.id == id }

    override fun addFrase(frase: Frase) {
        if (!frasesList.any { it.id == frase.id }) {
            frasesList.add(frase)
        }
    }

    override fun upgradeFrase(frase: Frase) {
        val index = frasesList.indexOfFirst { it.id == frase.id }
        if (index != -1) {
            frasesList[index] = frase
        }
    }

    // ========== CRUD para Usuario ==========
    override fun crearUsuario(usuario: Usuario): Boolean {
        return if (!usuariosMap.containsKey(usuario.id)) {
            usuariosMap[usuario.id] = usuario
=======
package Data

import Person.Author
import Person.Book
import Person.Loan

object MemoryDataManager : IDataManager {
    private val booksList = mutableListOf<Book>()
    private val authorsList = mutableListOf<Author>()
    private val loansList = mutableListOf<Loan>()

    init {
        // Agregar algunos autores de ejemplo para que la app no crashee
        authorsList.add(Author(1, "Gabriel García Márquez"))
        authorsList.add(Author(2, "Isabel Allende"))
        authorsList.add(Author(3, "Jorge Luis Borges"))
    }


    // =============================================================
    // ==================   CRUD DE LIBROS   ========================
    // =============================================================

    override fun addBook(libro: Book) {
        if (!booksList.any { it.id == libro.id }) {
            booksList.add(libro)
        }
    }

    override fun getAllBooks(): List<Book> = booksList.toList()

    override fun getBookById(id: Int): Book? = booksList.find { it.id == id }

    override fun updateBook(libro: Book): Boolean {
        val index = booksList.indexOfFirst { it.id == libro.id }
        return if (index != -1) {
            booksList[index] = libro
>>>>>>> origin/main
            true
        } else {
            false
        }
    }

<<<<<<< HEAD
    override fun obtenerUsuario(id: Int): Usuario? = usuariosMap[id]

    override fun obtenerTodosLosUsuarios(): List<Usuario> = usuariosMap.values.toList()

    override fun actualizarUsuario(usuario: Usuario): Boolean {
        return if (usuariosMap.containsKey(usuario.id)) {
            usuariosMap[usuario.id] = usuario
            // Si es el usuario actual, actualizar la referencia
            if (usuarioActual?.id == usuario.id) {
                usuarioActual = usuario
            }
=======
    override fun deleteBook(id: Int): Boolean {
        val libro = getBookById(id)
        return if (libro != null) {
            booksList.remove(libro)
>>>>>>> origin/main
            true
        } else {
            false
        }
    }

<<<<<<< HEAD
    override fun eliminarUsuario(id: Int): Boolean {
        return if (usuariosMap.containsKey(id)) {
            // Si es el usuario actual, cerrar sesión
            if (usuarioActual?.id == id) {
                cerrarSesion()
            }
            usuariosMap.remove(id)
=======



    override fun addAuthor(autor: Author) {
        if (!authorsList.any { it.id == autor.id }) {
            authorsList.add(autor)
        }
    }

    override fun getAllAuthors(): List<Author> = authorsList.toList()

    override fun getAuthorById(id: Int): Author? = authorsList.find { it.id == id }

    override fun updateAuthor(autor: Author): Boolean {
        val index = authorsList.indexOfFirst { it.id == autor.id }
        return if (index != -1) {
            authorsList[index] = autor
>>>>>>> origin/main
            true
        } else {
            false
        }
    }

<<<<<<< HEAD
    // ========== Gestión de sesión del usuario actual ==========
    override fun establecerUsuarioActual(usuario: Usuario) {
        usuarioActual = usuario
        // Asegurar que el usuario esté registrado en el sistema
        if (!usuariosMap.containsKey(usuario.id)) {
            crearUsuario(usuario)
        }
    }

    override fun obtenerUsuarioActual(): Usuario? = usuarioActual

    override fun cerrarSesion() {
        usuarioActual = null
    }

    override fun haySesionActiva(): Boolean = usuarioActual != null

    // ========== Métodos de utilidad adicionales ==========
    /**
     * Limpia todos los datos almacenados en memoria (útil para pruebas)
     */
    fun limpiarTodo() {
        animalsList.clear()
        colorsList.clear()
        numbersList.clear()
        fruitsList.clear()
        frasesList.clear()
        usuariosMap.clear()
        usuarioActual = null
    }

    /**
     * Limpia solo los datos de una categoría específica
     */
    fun limpiarAnimales() = animalsList.clear()
    fun limpiarColores() = colorsList.clear()
    fun limpiarNumeros() = numbersList.clear()
    fun limpiarFrutas() = fruitsList.clear()
    fun limpiarFrases() = frasesList.clear()
    fun limpiarUsuarios() {
        usuariosMap.clear()
        usuarioActual = null
    }
=======
    override fun deleteAuthor(id: Int): Boolean {
        val autor = getAuthorById(id)
        return if (autor != null) {
            authorsList.remove(autor)
            true
        } else {
            false
        }
    }




    override fun addLoan(prestamo: Loan) {
        if (!loansList.any { it.id == prestamo.id }) {
            loansList.add(prestamo)
        }
    }

    override fun getAllLoans(): List<Loan> = loansList.toList()

    override fun getLoanById(id: Int): Loan? = loansList.find { it.id == id }

    override fun updateLoan(prestamo: Loan): Boolean {
        val index = loansList.indexOfFirst { it.id == prestamo.id }
        return if (index != -1) {
            loansList[index] = prestamo
            true
        } else {
            false
        }
    }

    override fun deleteLoan(id: Int): Boolean {
        val prestamo = getLoanById(id)
        return if (prestamo != null) {
            loansList.remove(prestamo)
            true
        } else {
            false
        }
    }




    override fun hayLibros(): Boolean = booksList.isNotEmpty()

    override fun hayAutores(): Boolean = authorsList.isNotEmpty()

    override fun hayPrestamos(): Boolean = loansList.isNotEmpty()




    fun limpiarTodo() {
        booksList.clear()
        authorsList.clear()
        loansList.clear()
    }

    fun limpiarLibros() = booksList.clear()
    fun limpiarAutores() = authorsList.clear()
    fun limpiarPrestamos() = loansList.clear()
>>>>>>> origin/main
}