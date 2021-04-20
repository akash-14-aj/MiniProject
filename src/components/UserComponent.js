import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component{
constructor(props)
{
    super(props)
     this.state ={
    employees:[]
         }

}
componentDidMount(){

    UserService.getUsers().then((response)=>{
this.setState({employees:response.data})

    });
}

render (){
    return(
<div>
<h1 className="text-center">EMPLOYEES LIST</h1>
<table align='center' border='2' className="table-striped">
<thead>
    <tr>
        <td>  Employee Id</td>
        <td>  Employee Title</td>
        <td>  Employee Details</td>
    </tr>
</thead>
<tbody>

    {

    this.state.employees.map(
emp =>
<tr key={emp.id}>
        <td>{emp.id} </td>
        <td>{emp.name} </td>
        <td>{emp.role} </td>

</tr>


        )
    }
</tbody>

</table>

</div>
    )

}

}


export default UserComponent