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
           document.getElementById('idc').value = this.cells[1].textContent;
            document.getElementById('designationc').value = this.cells[2].textContent;
        };
    }
}
function returnDataCategorie2(){
    var table = document.getElementById('table_categories2'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('idc').value = this.cells[1].textContent;
            document.getElementById('designationc').value = this.cells[2].textContent;
        };
    }
}
function returnDataSoucategorie(){
    var table = document.getElementById('table_scategories'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('idcat').value = this.cells[1].textContent;
            document.getElementById('designationsc').value = this.cells[2].textContent;
        };
    }
}
function returnDataSoucategorie2(){
    var table = document.getElementById('table_scategories2'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('idcat').value = this.cells[1].textContent;
            document.getElementById('designationsc').value = this.cells[2].textContent;
        };
    }
}

function returnDataService(){
    var table = document.getElementById('table_service'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('id').value = this.cells[1].textContent;
            document.getElementById('designation').value = this.cells[2].textContent;
            document.getElementById('description').value = this.cells[3].textContent;
            document.getElementById('responsable').value = this.cells[4].textContent;
        };
    }
}

function returnDataFournisseur(){
    var table = document.getElementById('table_fournisseur'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('id').value = this.cells[1].textContent;
            document.getElementById('nom').value = this.cells[2].textContent;
            document.getElementById('prenom').value = this.cells[3].textContent;
            document.getElementById('phone').value = this.cells[4].textContent;
            document.getElementById('email').value = this.cells[5].textContent;
            document.getElementById('web').value = this.cells[7].textContent;
            document.getElementById('addresse').value = this.cells[6].textContent;
        };
    }
}

function returnDataUtilisateur(){
    var table = document.getElementById('table_utilisateur'),
            rIndex;
    for(let index =0; index < table.rows.length; index ++){
        table.rows[index].onclick = function(){
            rIndex = this.rowIndex;
            document.getElementById('id').value = this.cells[1].textContent;
            document.getElementById('nom').value = this.cells[2].textContent;
            document.getElementById('prenom').value = this.cells[3].textContent;
            document.getElementById('username').value = this.cells[5].textContent;
            document.getElementById('motpass').value = this.cells[6].textContent;
            document.getElementById('noms').textContent = this.cells[2].textContent+" "+this.cells[3].textContent;
            document.getElementById('usernames').textContent = this.cells[5].textContent;
            document.getElementById('comptes').textContent = this.cells[4].textContent;
        };
    }
}