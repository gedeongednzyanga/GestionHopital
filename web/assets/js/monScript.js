function retunDataProduct(){
     var table = document.getElementById('table_produit'),
                rIndex;
        for(let index = 0; index < table.rows.length; index++){
            table.rows[index].onclick = function(){
                rIndex = this.rowIndex;
                document.getElementById('id').value = this.cells[1].textContent;
                document.getElementById('designation').value = this.cells[2].textContent;
                document.getElementById('dosage').value = this.cells[3].textContent;
                document.getElementById('prixVenteU').value = parseFloat(this.cells[8].textContent);
                document.getElementById('stockAlert').value = parseInt(this.cells[6].textContent);
            };
        }
}
function returnDataCategorie(){
    var table = document.getElementById('table_categories'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('designationc').value = this.cells[1].textContent;
        };
    }
}
