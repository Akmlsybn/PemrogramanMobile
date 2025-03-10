class Barang {
    val barang = mutableListOf<DataBarang>()

    fun addBarang(id: Int, name: String, harga: Int, stok: Int) {
        barang.add(DataBarang(id, name, harga, stok)).also {
            println("Barang Berhasil Ditambahkan")
        }

    }

    fun listBarang() {
        if (barang.isEmpty()) {
            println("Barang Masih Kosong")
        } else {
            barang.forEach { println(it) }
        }
    }

    fun editBarang(id: Int, newName: String, newHarga: Int, updateStok: Int) {
        barang.find { it.id == id }?.apply {
            name = newName
            harga = newHarga
            stok = updateStok
            println("Barang Dengan perubahan: $this berhasil dirubah")
        } ?: println("Barang dengan ID: $id Tidak Ada")
    }

    fun hapusBarang(id: Int) {
        barang.find { it.id == id }?.also {
            barang.remove(it)
            println("Barang Dengan ID: $id Berhasil Di Hapus ")
        } ?: println("Barang dengan ID: $id Tidak Ada")
    }
}