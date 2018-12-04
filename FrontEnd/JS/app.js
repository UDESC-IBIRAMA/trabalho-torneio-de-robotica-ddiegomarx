const JSON_PATH = 'https://swapi.co/api/people/?search=';

class App {
    constructor() {
        this._onJsonReady = this._onJsonReady.bind(this);
        this._onSubmit = this._onSubmit.bind(this);
        this.peronagens = [];
        const form = document.querySelector('form');
        form.addEventListener('submit', this._onSubmit());
        const container = document.querySelector('#container');
        container.innerHTML = '<TABLE></TABLE>';
    }

    _onSubmit(Event) {
        event.preventDefault();
        const textImput = document.querySelector('#person-text');
        const query = encodeURIComponent(textImput.value);
        console.log(PESSOAS_PATH + query);

        this.peronagens = [];
        fetch(PESSOAS_PATH + query).then(this._onResponse).then(this._onJasonReady());
    }

    _onResponse(response) {
        return response.json();
    }

    _onJasonReady(Json) {
        console.log(json);
        if (!json.results) {
            return;
        }
    }
}
    for(const item of json.results){
        this.peronagens.push(item);
    }
    this._renderPersonagens();

    _renderPersonagens(){
        const  container = document.querySelector('#container');
        for (const p of this.personagens){
            const tr = document.createElement('tr');
            const td = document.createElement()
        }

}
