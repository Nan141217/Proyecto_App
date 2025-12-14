<<<<<<< HEAD
package data

import models.Animal
import models.Fruits
import models.Usuario
import models.colors
import models.numbers

interface IDataManager {
    // ========== Métodos existentes (sin modificar) ==========
    fun add(animal: Animal, colors: colors, fruits: Fruits, number: numbers)

    fun addAnimal(animal: Animal)

    fun addColor(color: colors)

    fun addNumero(numero: numbers)

    fun addFruta(fruta: Fruits)

    fun upgrade(animal: Animal)
    fun upgradeC(colors: colors)
    fun upgradeF(fruits: Fruits)
    fun upgradeN(number: numbers)

    // ========== Métodos de obtención de datos por categoría ==========
    fun getAllAnimals(): List<Animal>
    fun getAllColors(): List<colors>
    fun getAllNumbers(): List<numbers>
    fun getAllFruits(): List<Fruits>

    fun getAnimalById(id: Int): Animal?
    fun getColorById(id: Int): colors?
    fun getNumberById(id: Int): numbers?
    fun getFruitById(id: Int): Fruits?

    // Métodos para Frases
    fun getAllFrases(): List<models.Frase>
    fun getFraseById(id: Int): models.Frase?
    fun addFrase(frase: models.Frase)
    fun upgradeFrase(frase: models.Frase)

    // ========== CRUD para Usuario ==========
    /**
     * Crea un nuevo usuario en el sistema
     * @param usuario Usuario a crear
     * @return true si se creó exitosamente, false si ya existe un usuario con ese ID
     */
    fun crearUsuario(usuario: Usuario): Boolean

    /**
     * Obtiene un usuario por su ID
     * @param id ID del usuario
     * @return Usuario si existe, null en caso contrario
     */
    fun obtenerUsuario(id: Int): Usuario?

    /**
     * Obtiene todos los usuarios del sistema
     * @return Lista de todos los usuarios
     */
    fun obtenerTodosLosUsuarios(): List<Usuario>

    /**
     * Actualiza un usuario existente
     * @param usuario Usuario con datos actualizados (debe tener un ID válido)
     * @return true si se actualizó exitosamente, false si el usuario no existe
     */
    fun actualizarUsuario(usuario: Usuario): Boolean

    /**
     * Elimina un usuario del sistema
     * @param id ID del usuario a eliminar
     * @return true si se eliminó exitosamente, false si el usuario no existe
     */
    fun eliminarUsuario(id: Int): Boolean

    // ========== Gestión de sesión del usuario actual ==========
    /**
     * Establece el usuario actual de la sesión
     * @param usuario Usuario que inicia sesión
     */
    fun establecerUsuarioActual(usuario: Usuario)

    /**
     * Obtiene el usuario actual de la sesión
     * @return Usuario actual si hay sesión activa, null en caso contrario
     */
    fun obtenerUsuarioActual(): Usuario?

    /**
     * Cierra la sesión del usuario actual
     */
    fun cerrarSesion()

    /**
     * Verifica si hay un usuario activo en sesión
     * @return true si hay sesión activa, false en caso contrario
     */
    fun haySesionActiva(): Boolean
=======
package Data

import Person.Author
import Person.Book
import Person.Loan

interface IDataManager {
    fun addBook(libro: Book)

    fun getAllBooks(): List<Book>

    fun getBookById(id: Int): Book?

    fun updateBook(libro: Book): Boolean

    fun deleteBook(id: Int): Boolean

    fun addAuthor(autor: Author)

    fun getAllAuthors(): List<Author>

    fun getAuthorById(id: Int): Author?

    fun updateAuthor(autor: Author): Boolean

    fun deleteAuthor(id: Int): Boolean

    fun addLoan(prestamo: Loan)

    fun getAllLoans(): List<Loan>

    fun getLoanById(id: Int): Loan?

    fun updateLoan(prestamo: Loan): Boolean

    fun deleteLoan(id: Int): Boolean

    fun hayLibros(): Boolean

    fun hayAutores(): Boolean

    fun hayPrestamos(): Boolean
>>>>>>> origin/main
}