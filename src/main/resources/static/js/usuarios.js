async function cargaUsuarios(){

const request = await fetch('usuario/234',{
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        }
    });
    const usuarios = await request.json();

    let listadoHTML = '';
    for (let usuario of usuarios) {
        let usuarioHTML = '<tr><th>'+ usuario.id +'</th><th>'+ usuario.nombre +''+ usuario.apellido + '</th><th>' + usuario.email + '</th><th>'+ usuario.telefono + '</th><th><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></th></tr>'
        listadoHTML += usuarioHTML;
    }




    console.log(usuarios);
    document.querySelector('#usuarios tbody').outerHTML = listadoHTML;

}
