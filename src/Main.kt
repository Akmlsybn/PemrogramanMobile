fun main() {
    val barang = Barang()

    while (true) {
        println("Menu")
        println("1. Tambah Barang")
        println("2. List Barang")
        println("3. Edit Barang")
        println("4. Hapus Barang")
        println("5. Lihat Barang")
        println("6. Keluar")
        print("Pilih menu: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                var id: Int?
                var name: String?
                var harga: Int?
                var stok: Int?

                do {
                    print("Masukkan ID Barang: ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null) println("ID Barang Harus Angka!")
                } while (id == null)

                print("Masukkan Nama Barang: ")
                name = readln()

                do {
                    print("Masukkan Harga Barang: ")
                    harga = readlnOrNull()?.toIntOrNull()
                    if (harga == null) println("Harga Barang Harus Angka!")
                } while (harga == null)

                do {
                    print("Masukkan Stok Barang: ")
                    stok = readlnOrNull()?.toIntOrNull()
                    if (stok == null) println("Stok Barang Harus Angka!")
                } while (stok == null)
                barang.addBarang(id, name, harga, stok)
            }

            2 -> barang.listBarang()

            3 -> {

            }

            4 -> {

            }

            5 -> {

            }

            6 -> break
            else -> println("Menu tidak tersedia")
        }
    }
}
