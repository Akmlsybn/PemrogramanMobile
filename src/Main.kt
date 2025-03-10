fun main() {
    val barang = Barang()

    while (true) {
        println("Menu")
        println("1. Tambah Barang")
        println("2. List Barang")
        println("3. Edit Barang")
        println("4. Hapus Barang")
        println("5. Keluar")
        print("Pilih menu: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                var id: Int?
                var harga: Int?
                var stok: Int?
                var name: String?

                do {
                    print("Masukkan ID Barang: ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null) println("Masukkan ID yang benar!")
                } while (id == null)

                print("Masukkan Nama Barang: ")
                name = readln().orEmpty()

                do {
                    print("Masukkan Harga Barang: ")
                    harga = readlnOrNull()?.toIntOrNull()
                    if (harga == null) println("Masukkan Nama, Bukan Angka!")
                } while (harga == null)

                do {
                    print("Masukkan Stok Barang: ")
                    stok = readlnOrNull()?.toIntOrNull()
                    if (stok == null) println("Jumlah Stok nya yang benar!")
                } while (stok == null)
                barang.addBarang(id, name, harga, stok)
            }

            2 -> barang.listBarang()

            3 -> {
                var id: Int?

                do {
                    print("Masukkan ID Barang: ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null) println("ID Tidak Valid!")
                } while (id == null)

                val barangEdit = barang.barang.find { it.id == id }
                if (barangEdit == null) {
                    println("Barang Tidak Valid!")
                    continue
                }

                var newName: String
                do {
                    print("Masukkan Nama Barang Baru: ")
                    newName = readln().orEmpty()
                    if (newName.isEmpty()) println("Nama Jangan Kosong!")
                } while (newName.isEmpty())

                var newHarga: Int?
                do {
                    print("Masukkan Harga Barang Baru: ")
                    newHarga = readlnOrNull()?.toIntOrNull()
                    if (newHarga == null) println("Harga dalam bentuk angka!")
                } while (newHarga == null)

                var updateStok: Int?
                do {
                    print("Masukkan Stok Barang Baru: ")
                    updateStok = readlnOrNull()?.toIntOrNull()
                    if (updateStok == null) println("Stok Barang Harus Angka!")
                } while (updateStok == null)

                barang.editBarang(id, newName, newHarga, updateStok)

            }

            4 -> {
                var id: Int?
                do {
                    print("Masukkan ID Barang: ")
                    id = readlnOrNull()?.toIntOrNull()
                    if (id == null) println("ID Tidak Valid!")
                } while (id == null)

                val barangHapus = barang.barang.find { it.id == id }
                if (barangHapus != null) {
                    barang.barang.remove(barangHapus)
                    println("Barang Berhasil Dihapus")
                } else {
                    println("Barang Tidak Valid!")
                }
            }

            5 ->{
                println("Keluar")
                break
            }
            else -> {
                println("Menu Tidak Valid")
            }
        }
    }
}
