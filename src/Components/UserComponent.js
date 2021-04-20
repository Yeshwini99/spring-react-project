import React from 'react'
import UserService from '../Services/UserService'

class UserComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            users: []
        }
    }
    componentDidMount() {
        UserService.getUsers().then((response) => {
            this.setState({ users: response.data })
        });
    }
    render() {
        return (
            <div>
                <h2 className="text-center">List of Users in the Company</h2>
                <br />
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>User ID</td>
                            <td>User First Name</td>
                            <td>User Last Name</td>
                            <td>User Email ID</td>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.users.map(
                                user =>
                                    <tr key={user.id}>
                                        <td>{user.id}</td>
                                        <td>{user.firstname}</td>
                                        <td>{user.lastname}</td>
                                        <td>{user.email}</td>
                                    </tr>
                            )
                        }
                    </tbody>

                </table>

            </div>

        )
    }

}

export default UserComponent;