package `is`.hafro.dataimport

import java.io.File

/**
 * Reads a csv data file and replaces whitespace characters
 * with tabs before writing output to a file.
 */

val pattern = "\\s".toRegex()

fun main() {
    print("Preparation started ...")
    fun readAndInsertTabs(fileName: String) = File(fileName).forEachLine {
        File("test_data_copy").appendText(it.replace(pattern, "\t").plus("\n"))
    }

    readAndInsertTabs("test_data")
    print("finale")
}

